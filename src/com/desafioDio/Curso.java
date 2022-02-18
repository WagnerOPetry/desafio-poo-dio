package com.desafioDio;

public class Curso extends Conteudo {

	private int cargaHoraria;

	@Override
	public double calcularXp() {
		return XP_PADRAO * cargaHoraria; // regra de negocio
	}

	public Curso() {
		super();
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public String toString() {
		return "Curso [titulo = " + getTitulo() + ", descricao = " + getDescricao() + ", cargaHoraria = " + cargaHoraria
				+ "]";
	}

}
