package com.nacho.tame.recyclerview;

import java.util.ArrayList;
import java.util.List;

public class Receta {
    private String titulo;
    private String descripcion;
    private String imageUrl;
    private String recipe;


    public Receta(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    public Receta() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getRecipe() {
        return recipe;
    }

    public void setRecipe(String recipe) {
        this.recipe = recipe;
    }

    public static Receta getReceta1(){
        Receta kefir = new Receta();
        kefir.setTitulo("Kéfir");
        kefir.setDescripcion("Invade las neveras de nuestros supermercados, se mezcla entre nuestros lácteos habituales, lo vemos anunciado en todas partes, triunfa en los desayunos de Instagram");
        kefir.setImageUrl("https://www.recetasderechupete.com/wp-content/uploads/2019/01/shutterstock_504850108.jpg");
        kefir.setRecipe("1 o 2 cucharadas de granos de kéfir\n" +
                "Un recipiente con tapa\n" +
                "2 tazas de zumo o bebida de coco, avena, té… lo que tú quieras.\n" +
                "Pon los granos de kéfir en el recipiente y añade la bebida elegida. Procura no llenar el recipiente hasta arriba; deja 2-3 cm libres.\n" +
                "Tápalo y déjalo reposar entre 12 y 36 horas a temperatura ambiente.\n" +
                "Cuando empiece a tener consistencia grumosa, cuela el líquido para separar los granos de kéfir de la bebida.");
        return kefir;
    }

    public static Receta getReceta2(){
        Receta kokotxas = new Receta();
        kokotxas.setTitulo("Kokotxas de bacalao");
        kokotxas.setDescripcion("Quizá una de las partes más nobles y más valoradas de muchos pescados son las cocochas o kokotxas como se dice en euskera.");
        kokotxas.setImageUrl("https://www.recetasderechupete.com/wp-content/uploads/2014/11/cocochas_bacalao_salsa_verde-525x360.jpg");
        kokotxas.setRecipe("500 gr. kokotxas o cocochas de bacalao\n" +
                "2 dientes de ajo    \n" +
                "Aceite de oliva virgen extra\n" +
                "Aceite suave para freír\n" +
                "1 guindilla y sal (al gusto)\n" +
                "1 vaso de vino blanco Jerez\n" +
                "1 vaso de agua o caldo\n" +
                "1 manojo de perejil fresco\n" +
                "Para rebozar: Harina y huevo");
        return kokotxas;
    }

    public static Receta getReceta3(){
        Receta chip = new Receta();
        chip.setTitulo("Chipirones en su tinta");
        chip.setDescripcion("La diferencia entre chipirón y calamar es únicamente cuestión de tamaño, el chipirón es el calamar pequeño. Son muy típicos en el país vasco donde son conocidos con su grafía como “txipirones”.");
        chip.setImageUrl("https://www.recetasderechupete.com/wp-content/uploads/2015/01/chipirones_tinta-525x360.jpg");
        chip.setRecipe("32 chipirones\n" +
                "2 cebollas grandes\n" +
                "1 tomate grande\n" +
                "3 dientes de ajo\n" +
                "Caldo de pescado\n" +
                "Un manojo de perejil fresco\n" +
                "Sal y pimienta negra recién molida (al gusto)\n" +
                "Aceite de oliva virgen extra");
        return chip;
    }

    public static List<Receta> getRecetaList(int repetir){
        List<Receta> list = new ArrayList<>();
        for(int i=0; i<repetir; i++){
            list.add(getReceta1());
            list.add(getReceta2());
            list.add(getReceta3());
        }
        return list;
    }
}
