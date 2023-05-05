public class Main {
    public static void main(String[] args) {
        LinkQueue queue = new LinkQueue();
        //Penambahan antrean pasien
        queue.enqueue("Pasien1");
        queue.enqueue("Pasien2");
        queue.enqueue("Pasien3");
        System.out.println("Panjang Antrean: "+queue.size());
        queue.displayQueue();

        //Pemanggilan pasien
        System.out.println("Pemanggilan kepada "+queue.dequeue());
        System.out.println("Panjang Antrean: "+queue.size());
        queue.displayQueue();

        //Pemberitahuan persiapan pasien selanjutnya
        System.out.println("Kepada "+queue.peek()+" harap siap-siap");
        System.out.println("Panjang Antrean: "+queue.size());
        queue.displayQueue();
    }
}
