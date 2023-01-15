public class ImageResizer {
    public static void main(String[] args) {
        String srcFolder = "/Users/admin/space3";
        String dstFolder = "/Users/admin/space3_out";

        Resizable obj = new SimpleResizer();
        obj.ResizeFolder(srcFolder, dstFolder);


    }
}
