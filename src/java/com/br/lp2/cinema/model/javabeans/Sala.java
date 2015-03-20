package com.br.lp2.cinema.model.javabeans;

/**
 *
 * @author 31410758 // 31400817 // 31431038
 */
public class Sala {

    private int id_sala;
    private int numero;
    private int lotacao;
    private int especiais;

    /**
     *
     * @param lotacao Lotação maxima da sala
     * @param especiais Numero de poltronas especiais
     */
    public Sala(int numero, int lotacao, int especiais) {
        this.id_sala = numero;
        this.numero = numero;
        this.lotacao = lotacao;
        this.especiais = especiais;
    }

    public Sala() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getLotacao() {
        return lotacao;
    }

    public void setLotacao(int lotacao) {
        this.lotacao = lotacao;
    }

    public int getEspeciais() {
        return especiais;
    }

    public void setEspeciais(int especiais) {
        this.especiais = especiais;
    }

    public int getId() {
        return id_sala;
    }

}
