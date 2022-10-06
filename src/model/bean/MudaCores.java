package model.bean;

import org.w3c.dom.css.CSSPrimitiveValue;
import org.w3c.dom.css.RGBColor;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageProducer;
import java.nio.ByteBuffer;

public class MudaCores {

    public static BufferedImage vermelho(BufferedImage imagem) {
        BufferedImage bi = imagem;
        Color cor;
        for (int i = 0; i < bi.getWidth(); i++) {
            for (int j = 0; j < bi.getHeight(); j++) {
                cor = new Color(bi.getRGB(i, j));
                int pixelR = 0;
                int pixelG = 0;
                int pixelB = 0;

                pixelR = cor.getRed();
                pixelG = cor.getGreen() - 255;
                pixelB = cor.getBlue() - 255;

                pixelR = Math.max(pixelR, 0);
                pixelR = Math.min(255, pixelR);

                pixelG = Math.max(pixelG, 0);
                pixelG = Math.min(255, pixelG);

                pixelB = Math.max(pixelB, 0);
                pixelB = Math.min(255, pixelB);


                bi.setRGB(i, j, new Color(pixelR, pixelG, pixelB).getRGB());

            }
        }
        return bi;


    }

    public static BufferedImage azul(BufferedImage imagem) {
        BufferedImage bi = imagem;
        Color cor;
        for (int i = 0; i < bi.getWidth(); i++) {
            for (int j = 0; j < bi.getHeight(); j++) {
                cor = new Color(bi.getRGB(i, j));
                int pixelR = 0;
                int pixelG = 0;
                int pixelB = 0;

                pixelR = cor.getRed() - 255;
                pixelG = cor.getGreen() - 255;
                pixelB = cor.getBlue();

                pixelR = Math.max(pixelR, 0);
                pixelR = Math.min(255, pixelR);

                pixelG = Math.max(pixelG, 0);
                pixelG = Math.min(255, pixelG);

                pixelB = Math.max(pixelB, 0);
                pixelB = Math.min(255, pixelB);


                bi.setRGB(i, j, new Color(pixelR, pixelG, pixelB).getRGB());

            }
        }
        return bi;


    }

    public static BufferedImage verde(BufferedImage imagem) {
        BufferedImage bi = imagem;
        Color cor;
        for (int i = 0; i < bi.getWidth(); i++) {
            for (int j = 0; j < bi.getHeight(); j++) {
                cor = new Color(bi.getRGB(i, j));
                int pixelR = 0;
                int pixelG = 0;
                int pixelB = 0;

                pixelR = cor.getRed() - 255;
                pixelG = cor.getGreen();
                pixelB = cor.getBlue() - 255;

                pixelR = Math.max(pixelR, 0);
                pixelR = Math.min(255, pixelR);

                pixelG = Math.max(pixelG, 0);
                pixelG = Math.min(255, pixelG);

                pixelB = Math.max(pixelB, 0);
                pixelB = Math.min(255, pixelB);


                bi.setRGB(i, j, new Color(pixelR, pixelG, pixelB).getRGB());

            }
        }
        return bi;


    }

    public static BufferedImage gride(BufferedImage imagem) {
        BufferedImage bi = imagem;
        Color cor;
        for (int i = 0; i < bi.getWidth(); i += 4) {
            for (int j = 0; j < bi.getHeight(); j += 4) {

                bi.setRGB(i, j, new Color(0, 0, 0).getRGB());

            }
        }
        return bi;


    }

    public static BufferedImage pretobranco(BufferedImage imagem) {
        BufferedImage bi = imagem;
        Color cor;
        for (int i = 0; i < bi.getWidth(); i++) {
            for (int j = 0; j < bi.getHeight(); j++) {
                cor = new Color(bi.getRGB(i, j));
                int pixelR = 0;
                int pixelG = 0;
                int pixelB = 0;
                int avg = (cor.getRed() + cor.getBlue() + cor.getGreen()) / 3;
                pixelR = avg;
                pixelG = avg;
                pixelB = avg;

                pixelR = Math.max(pixelR, 0);
                pixelR = Math.min(255, pixelR);

                pixelG = Math.max(pixelG, 0);
                pixelG = Math.min(255, pixelG);

                pixelB = Math.max(pixelB, 0);
                pixelB = Math.min(255, pixelB);


                bi.setRGB(i, j, new Color(pixelR, pixelG, pixelB).getRGB());

            }
        }
        return bi;


    }

    public static BufferedImage pretobranco2(BufferedImage imagem) {
        BufferedImage bi = imagem;
        Color cor;
        for (int i = 0; i < bi.getWidth(); i++) {
            for (int j = 0; j < bi.getHeight(); j++) {
                cor = new Color(bi.getRGB(i, j));
                int pixelR = 0;
                int pixelG = 0;
                int pixelB = 0;
                int avg = (cor.getRed() + cor.getBlue() + cor.getGreen()) / 3;
                if (avg < 127) {
                    pixelR = 0;
                    pixelG = 0;
                    pixelB = 0;
                } else {
                    pixelR = 255;
                    pixelG = 255;
                    pixelB = 255;
                }


                pixelR = Math.max(pixelR, 0);
                pixelR = Math.min(255, pixelR);

                pixelG = Math.max(pixelG, 0);
                pixelG = Math.min(255, pixelG);

                pixelB = Math.max(pixelB, 0);
                pixelB = Math.min(255, pixelB);


                bi.setRGB(i, j, new Color(pixelR, pixelG, pixelB).getRGB());

            }
        }
        return bi;


    }
}
