package com.desafioDio;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {

		Curso curso1 = new Curso();
		curso1.setTitulo("Curso Java POO");
		curso1.setDescricao("Curso de POO em linguagem JAVA");
		curso1.setCargaHoraria(40);

		Curso curso2 = new Curso();
		curso2.setTitulo("SpringBoot para iniciantes");
		curso2.setDescricao("Curso de introdução em desenvolvimento Java com Spring");
		curso2.setCargaHoraria(10);

		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Mentoria Java");
		mentoria.setDescricao("Descricao Mentoria Java");
		mentoria.setData(LocalDate.now());

		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setName("Bootcamp Java Developer");
		bootcamp.setDescricao("Descricao do Bootcamp Java");
		bootcamp.getConteudos().add(curso1);
		bootcamp.getConteudos().add(curso2);
		bootcamp.getConteudos().add(mentoria);

		Dev devCamila = new Dev();
		devCamila.setNome("Camila");
		devCamila.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos: " + devCamila.getConteudosInscritos());
		devCamila.progredir();
		devCamila.progredir();
		System.out.println("");
		System.out.println("----");
		System.out.println("Conteudos inscritos: " + devCamila.getConteudosInscritos());
		System.out.println("Conteudos concluídos: " + devCamila.getConteudosConcluidos());
		System.out.println("XP: " + devCamila.calcularTotalXp());

		Dev devJoao = new Dev();
		devJoao.setNome("Joao");
		devJoao.inscreverBootcamp(bootcamp);
		System.out.println("Conteudos inscritos: " + devJoao.getConteudosInscritos());
		devJoao.progredir();
		devJoao.progredir();
		devJoao.progredir();
		System.out.println("");
		System.out.println("----");
		System.out.println("Conteudos inscritos: " + devJoao.getConteudosInscritos());
		System.out.println("Conteudos concluídos: " + devJoao.getConteudosConcluidos());
		System.out.println("XP: " + devJoao.calcularTotalXp());
	}

}
