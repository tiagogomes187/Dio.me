package br.dev.tiagogomes;

import br.dev.tiagogomes.model.Obj;

public class Main {
	public static void main(String[] args) {

		ArvoreBinaria <Obj> minhaArvore = new ArvoreBinaria<Obj>();
//		minhaArvore.inserir(new Obj(13));
//		minhaArvore.inserir(new Obj(10));
//		minhaArvore.inserir(new Obj(25));
//		minhaArvore.inserir(new Obj(2));
//		minhaArvore.inserir(new Obj(12));
//		minhaArvore.inserir(new Obj(20));
//		minhaArvore.inserir(new Obj(31));
//		minhaArvore.inserir(new Obj(32));

//		minhaArvore.inserir(new Obj(8));
//		minhaArvore.inserir(new Obj(10));
//		minhaArvore.inserir(new Obj(3));
//		minhaArvore.inserir(new Obj(6));
//		minhaArvore.inserir(new Obj(1));
//		minhaArvore.inserir(new Obj(4));
//		minhaArvore.inserir(new Obj(7));
//		minhaArvore.inserir(new Obj(14));
//		minhaArvore.inserir(new Obj(13));

		minhaArvore.inserir(new Obj(78));
		minhaArvore.inserir(new Obj(12));
		minhaArvore.inserir(new Obj(35));
		minhaArvore.inserir(new Obj(1));
		minhaArvore.inserir(new Obj(17));
		minhaArvore.inserir(new Obj(4));
		minhaArvore.inserir(new Obj(43));
		minhaArvore.inserir(new Obj(11));
		minhaArvore.inserir(new Obj(17));
		minhaArvore.inserir(new Obj(1));


		minhaArvore.exibirInOrdem();
		minhaArvore.exibirPreOrdem();
		minhaArvore.exibirPosOrdem();

	}
}
