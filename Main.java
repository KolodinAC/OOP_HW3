public class Main {
    public static void main(String[] args) {
        Gestalt_List<String> myGames = new Gestalt_List<>();
        myGames.add("Dark Souls 1");
        myGames.add("Dark Souls 2");
        myGames.add("Dark Souls 3");
        myGames.add("Dark Souls 4");
        myGames.add("Dark Souls 5");
        myGames.add("Dark Souls 6");
        myGames.forEach(System.out::println);

        System.out.println("\n********************\n");
        System.out.println(String.format("Игр в списке: %d", myGames.size()));
        System.out.println("\n********************\n");
        System.out.println(myGames.getPreviousByIndex(3));
        System.out.println(myGames.getByIndex(4));
        System.out.println(myGames.getNextByIndex(1));
        myGames.replaceByIndex(5, "Elden Ring");
        System.out.println(myGames.getByIndex(5));
        System.out.println("\n********************\n");
        System.out.println("Список игр после замены: \n");
        myGames.forEach(System.out::println);
    }
}

