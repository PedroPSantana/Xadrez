package modelo;


import visao.JXadrez;

public class Tabuleiro {

    private Peca[][] pecas;
    private Peca pecaSelecionada = null;
    private EnumCor vez = EnumCor.BRANCO;
    public static final Integer TEMPO_JOGADA = 10000;

    public Tabuleiro() {
        this.pecas = new Peca[8][8];
        Bispo bispoBranco3 = new Bispo(EnumCor.BRANCO, 0, 0);
        Bispo bispoBranco4 = new Bispo(EnumCor.BRANCO, 0, 7);
        this.adicionaPeca(bispoBranco3);
        this.adicionaPeca(bispoBranco4);

        Bispo bispoPreto5 = new Bispo(EnumCor.PRETO, 7, 0);
        Bispo bispoPreto6 = new Bispo(EnumCor.PRETO, 7, 7);
        this.adicionaPeca(bispoPreto5);
        this.adicionaPeca(bispoPreto6);

        Cavalo cavaloBranco1 = new Cavalo(EnumCor.BRANCO, 0, 1);
        Cavalo cavaloBranco2 = new Cavalo(EnumCor.BRANCO, 0, 6);
        this.adicionaPeca(cavaloBranco1);
        this.adicionaPeca(cavaloBranco2);

        Cavalo cavaloPreto1 = new Cavalo(EnumCor.PRETO, 7, 1);
        Cavalo cavaloPreto2 = new Cavalo(EnumCor.PRETO, 7, 6);
        this.adicionaPeca(cavaloPreto1);
        this.adicionaPeca(cavaloPreto2);

        Bispo bispoBranco1 = new Bispo(EnumCor.BRANCO, 0, 2);
        Bispo bispoBranco2 = new Bispo(EnumCor.BRANCO, 0, 5);
        this.adicionaPeca(bispoBranco1);
        this.adicionaPeca(bispoBranco2);

        Bispo bispoPreto1 = new Bispo(EnumCor.PRETO, 7, 2);
        Bispo bispoPreto2 = new Bispo(EnumCor.PRETO, 7, 5);
        this.adicionaPeca(bispoPreto1);
        this.adicionaPeca(bispoPreto2);

        Cavalo cavaloBranco3 = new Cavalo(EnumCor.BRANCO, 0, 3);
        Rei reiBranco = new Rei(EnumCor.BRANCO, 0, 4);
        this.adicionaPeca(cavaloBranco3);
        this.adicionaPeca(reiBranco);
        Cavalo cavaloPreto4 = new Cavalo(EnumCor.PRETO, 7, 4);
        Rei reiPreto = new Rei(EnumCor.PRETO, 7, 3);
        this.adicionaPeca(cavaloPreto4);
        this.adicionaPeca(reiPreto);

        for(int i = 0; i < 8; i++) {
            Peao peaoBranco = new Peao(EnumCor.BRANCO, 1, i);
            this.adicionaPeca(peaoBranco);

            Peao peaoPreto = new Peao(EnumCor.PRETO, 6, i);
            this.adicionaPeca(peaoPreto);
        }
      

    }

    public EnumCor getVez() {
        return this.vez;
    }

    public void setPecaSecionada(Peca peca) {
        this.pecaSelecionada = peca;
    }

    public Peca getPecaSelecionada() {
        return this.pecaSelecionada;
    }

    public Peca getPeca(Integer linha, Integer coluna) {
        return this.pecas[linha][coluna];
    }

    public void setPeca(Peca peca) {
        this.pecas[peca.getLinha()][peca.getColuna()] = peca;
        peca.setTabuleiro(this);
    }
 
    public void adicionaPeca(Peca peca) {
        this.pecas[peca.getLinha()][peca.getColuna()] = peca;
        peca.setTabuleiro(this);
    }

    public void selecionaPeca(Peca peca) {
        if (peca.isSelecionada()) {
            peca.setSelecionada(false);
            this.pecaSelecionada = null;
        } else {
            peca.setSelecionada(true);
            this.pecaSelecionada = peca;
        }
    }

    public void movePeca(Peca peca, Integer novaLinha, Integer novaColuna) {
         if(peca.validaMovimento(novaLinha, novaColuna)) {
             this.pecas[peca.getLinha()][peca.getColuna()] = null;
             peca.setLinha(novaLinha);
             peca.setColuna(novaColuna);
             this.setPeca(peca);
             this.selecionaPeca(peca);
             this.inverteVez();
         }
    }

    public void inverteVez() {
        if (this.vez.equals(EnumCor.BRANCO)) {
            this.vez = EnumCor.PRETO;
        } else {
            this.vez = EnumCor.BRANCO;
        }
        JXadrez.setVez(this.vez);
    }

    public void realizaJogada(int linha, int coluna) {
        Peca peca = this.getPeca(linha, coluna);
        if(this.pecaSelecionada== null) {
            if(peca != null && peca.getCor().equals(this.vez)){
                this.selecionaPeca(peca);
            }
        } else {
            if(this.pecaSelecionada == peca) {
                this.selecionaPeca(peca);
            } else {
                if(peca == null || !peca.getCor().equals(this.pecaSelecionada.getCor())) {
                    this.movePeca(this.pecaSelecionada, linha, coluna);
                }
            }
        }
    }

}
