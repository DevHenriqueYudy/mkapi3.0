package onnet.mkapi.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mk_planos_acesso_tipos")
public class PlanoAcessoTipo {	

	@Id
	@Column(name="codplanoacessotipo")
	private long id;
	
	@Column(name="descricao")
	private String descricao;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
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
		PlanoAcessoTipo other = (PlanoAcessoTipo) obj;
		if (id != other.id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "PlanoAcessoTipo [id=" + id + ", descricao=" + descricao + "]";
	}
	
}
