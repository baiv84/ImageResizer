public interface Resizable {
     public static int getPhysicalCoresNumber() {
        int coreNumber = Runtime.getRuntime().availableProcessors() / 2;
        if (coreNumber == 0) {
            coreNumber = 1;
        }
        return coreNumber;
    }

    public void ResizeFolder(String srcFolder, String dstFolder);
}