import java.util.ArrayList;
public class Playlist {
    public static void main(String[] args) {
        ArrayList<String> listaParaIlhaDeserta = new ArrayList<String>();
        listaParaIlhaDeserta.add("Christian Woman");
        listaParaIlhaDeserta.add("Lucretia");
        listaParaIlhaDeserta.add("The Hunt");
        listaParaIlhaDeserta.add("Bela Lugosi's Dead");
        listaParaIlhaDeserta.add("The Pot");
        listaParaIlhaDeserta.add("Summer Breeze");
        System.out.println(listaParaIlhaDeserta);
        System.out.println(listaParaIlhaDeserta.size());
        
        listaParaIlhaDeserta.remove("Christian Woman");
        System.out.println(listaParaIlhaDeserta.size());


        String musicaA = "Lucretia";
        String musicaB = "Summer Breeze";
        int indexA = listaParaIlhaDeserta.indexOf(musicaA);
        int indexB = listaParaIlhaDeserta.indexOf(musicaB);
        System.out.println(indexA);
        System.out.println(indexB);
        
        String tempA = listaParaIlhaDeserta.get(indexA);
        listaParaIlhaDeserta.set(indexA, listaParaIlhaDeserta.get(indexB));
        System.out.println(listaParaIlhaDeserta);

        listaParaIlhaDeserta.set(indexB, tempA);
        System.out.println(listaParaIlhaDeserta);
    }
}