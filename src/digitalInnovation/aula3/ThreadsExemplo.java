package digitalInnovation.aula3;

import java.util.TreeMap;

public class ThreadsExemplo {

    public static void main(String[] args) {
        /*BarraDeCarregamento barraDeCarregamento = new BarraDeCarregamento();
        BarraDeCarregamento2 barraDeCarregamento2 = new BarraDeCarregamento2();
        BarraDeCarregamento3 barraDeCarregamento3 = new BarraDeCarregamento3();*/

        GeradorPDF iniciarGeradorPDF = new GeradorPDF();

        BarraDeCarregamento iniciarBarraDeCarregamento = new BarraDeCarregamento(iniciarGeradorPDF);

        iniciarGeradorPDF.start();
        iniciarBarraDeCarregamento.start();

    }
}


class GeradorPDF extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("Iniciar geração de PDF");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("PDF Gerado com Sucesso!");
    }
}


class BarraDeCarregamento extends Thread {
    private Thread iniciarGeradorPDF;

    public BarraDeCarregamento(Thread iniciarGeradorPDF) {

        this.iniciarGeradorPDF = iniciarGeradorPDF;
    }
    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(500);

                if (!iniciarGeradorPDF.isAlive()) {
                    break;
                }
                System.out.println("Loading...");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    class BarraDeCarregamento2 implements Runnable {
        @Override
        public void run() {

            try {
                Thread.sleep(10000);
                System.out.println("Rodei BarraDeCarregamento2  :  ");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    class BarraDeCarregamento3 implements Runnable {
        @Override
        public void run() {


            try {
                Thread.sleep(5000);
                System.out.println("Rodei BarraDeCarregamento3  :  ");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}


