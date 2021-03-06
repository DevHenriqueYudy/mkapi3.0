package onnet.mkapi.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "mk_conexoes")
public class Conexao {

    @Id
    @Column(name="codconexao")
    private Long id;
    
    @ManyToOne
    @JoinColumn(name="contrato")
    private Contrato contrato;
    
    @Column(name="conexao_bloqueada")
    private String conexaoBloqueada;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Contrato getContrato() {
		return contrato;
	}

	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}

	public String getConexaoBloqueada() {
		return conexaoBloqueada;
	}

	public void setConexaoBloqueada(String conexaoBloqueada) {
		this.conexaoBloqueada = conexaoBloqueada;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Conexao other = (Conexao) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Conexao [id=" + id + ", contrato=" + contrato + ", conexaoBloqueada=" + conexaoBloqueada + "]";
	}
    
}
