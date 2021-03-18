package br.com.one.innovation.digital.aula03;

public class ThredExemplo {
    public static void main(String[] args) {

        GeradorPDF iniciarGerarPDF = new GeradorPDF();
        BarraDeCarregamento inicialiarBarraDeCarregamento = new BarraDeCarregamento(iniciarGerarPDF);

        iniciarGerarPDF.start();
        inicialiarBarraDeCarregamento.start();

    }
}

class GeradorPDF extends Thread {

    @Override
    public void run() {
        try {
            System.out.println("Iniciar Geração de PDF.");
            Thread.sleep(5000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("PDF Gerado.");
    }
}

class BarraDeCarregamento extends Thread {

    private Thread iniciarPDF;

    public BarraDeCarregamento(Thread iniciarPDF) {
        this.iniciarPDF = iniciarPDF;
    }

    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(500);
                if (!iniciarPDF.isAlive()){
                    break;
                }
                System.out.println("Loading...");
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

//class BarraDeCarregamento2 implements Runnable {
//    @Override
//    public void run() {
//        try {
//            Thread.sleep(3000);
//            System.out.println("Barra de carregamento 2");
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//}
//
//class BarraDeCarregamento3 implements Runnable {
//    @Override
//    public void run() {
//        try {
//            Thread.sleep(1000);
//            System.out.println("Barra de carregamento 3");
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }
//}