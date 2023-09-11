package br.com.alura.mvc.mudi.model;

import javax.persistence.*;

@Entity
public class Pedido {
	

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
	@Column
    private String nomeProduto;
    private String valorNegociado;
    private String dataDaEntrega;
    private String urlProduto;
    private String urlImagem;
    private String descricao;
    
    @Enumerated(EnumType.STRING)
    private StatusPedido status;

    public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	public Pedido() {
		super();
    }
		
    // Getters

    public String getNomeProduto() {
        return nomeProduto;
    }

    public String getValorNegociado() {
        return valorNegociado;
    }

    public String getDataDaEntrega() {
        return dataDaEntrega;
    }

    public String getUrlProduto() {
        return urlProduto;
    }

    public String getUrlImagem() {
        return urlImagem;
    }

    public String getDescricao() {
        return descricao;
    }

    // Setters

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setValorNegociado(String string) {
        this.valorNegociado = string;
    }

    public void setDataDaEntrega(String string) {
        this.dataDaEntrega = string;
    }

    public void setUrlProduto(String urlProduto) {
        this.urlProduto = urlProduto;
    }

    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
