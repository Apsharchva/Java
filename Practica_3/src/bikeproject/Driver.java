public class Driver {
    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike("MTB-100", 2023, "Front", "Hardtail");
        RoadBike roadBike = new RoadBike("RB-200", 2023, "25mm", "18");
        
        System.out.println("=== Исходные данные ===");
        System.out.println(mountainBike);
        System.out.println(roadBike);
        
        // Обновление высоты столба для bike1 до 20 вместо 22
        roadBike.setPostHeight("20");
        
        System.out.println("\n=== После изменения высоты столба ===");
        System.out.println(roadBike);
        
        // Подтверждение изменения
        System.out.println("\n=== Подтверждение изменения ===");
        System.out.println("Новая высота столба: " + roadBike.getPostHeight());
    }
}