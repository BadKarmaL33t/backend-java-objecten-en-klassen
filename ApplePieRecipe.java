public class ApplePieRecipe {

        Ingredient butter = new Ingredient(200, "gram", "ongezouten roomboter");
        Ingredient bastardSugar = new Ingredient(200, "gram", "witte bastard suiker");
        Ingredient flour = new Ingredient(400, "gram", "zelfrijzend bakmeel");
        Ingredient egg = new Ingredient(1, "stuk(s)", "ei");
        Ingredient vanillaSugar = new Ingredient(8, "gram", "vanillesuiker");
        Ingredient salt = new Ingredient(1, "snuf", "zout");
        Ingredient apples = new Ingredient(1.5, "kilo", "zoetzure appels");
        Ingredient granulatedSugar = new Ingredient(75, "gram", "kristal suiker");
        Ingredient cinnamon = new Ingredient(3, "theelepels", "kaneel");
        Ingredient breadCrumbs = new Ingredient(15, "gram", "paneermeel");

    public void printIngredients() {
        System.out.println("Je hebt de volgende ingredienten nodig om dit recept te maken:");
        System.out.println(bastardSugar.getAmount() + " " + bastardSugar.getUnit() + " " + bastardSugar.getName());
        System.out.println(flour.getAmount() + " " + flour.getUnit() + " " + flour.getName());
        System.out.println(egg.getAmount() + " " + egg.getUnit() + " " + egg.getName());
        System.out.println(vanillaSugar.getAmount() + " " + vanillaSugar.getUnit() + " " + vanillaSugar.getName());
        System.out.println(salt.getAmount() + " " + salt.getUnit() + " " + salt.getName());
        System.out.println(apples.getAmount() + " " + apples.getUnit() + " " + apples.getName());
        System.out.println(granulatedSugar.getAmount() + " " + granulatedSugar.getUnit() + " " + granulatedSugar.getName());
        System.out.println(cinnamon.getAmount() + " " + cinnamon.getUnit() + " " + cinnamon.getName());
        System.out.println(breadCrumbs.getAmount() + " " + breadCrumbs.getUnit() + " " + breadCrumbs.getName());
    }

    public void printRecipe() {
        preHeat();
        whiskEggs();
        mixIngredients();
        prepApples();
        addFlourToBowl();
        prepPieEdgesAndBottom();
        seasonApples();
        cutDoughStrips();
        addDoughStrips();
        bakePieInOven();
    }

    public void preHeat() {
        System.out.println("Verwarm de oven van te voren op 170 graden Celsius (boven en onderwarmte)");
    }

    public void whiskEggs() {
        System.out.println("Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.");
    }

    public void mixIngredients() {
        System.out.println("Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.");
    }

    public void prepApples() {
        System.out.println("Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.");
    }

    public void addFlourToBowl() {
        System.out.println("Vet de springvorm in en bestrooi deze met bloem");
    }

    public void prepPieEdgesAndBottom() {
        System.out.println("Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.");
    }

    public void seasonApples() {
        System.out.println("Doe de heft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.");
    }

    public void cutDoughStrips() {
        System.out.println("Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.");
    }

    public void addDoughStrips() {
        System.out.println("Leg de stroken kuislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken.");
    }

    public void bakePieInOven() {
        System.out.println("Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.");
    }
}
