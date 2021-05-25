import java.util.LinkedList;

public class main {
    public static void main(String[] args) {
        //Lossy
        String[][] lossyCompression = LossyCompression.downScale(rateOfDownscale, LectorCVS.getDataset(nombreArchivo));
        //ingresar nombre de archivo y escala a comprimir
        LectorCVS.printMatriz(LossyCompression.upScale(rateOfUpscale, lossyCompression));

        //No loss
        //ALGORITMO 1
        LinkedList<DLC> CompressedLz77 = new LinkedList<>();
        CompressedLz77 = NoLossComp.Lz77(LectorCVS.getDatasetLz77(nombreArchivo), searchBuffer, lookBuffer);
        //ingresar nombre de archivo y escala a comprimir
        String DecompressedLz77 = "";
        DecompressedLz77 = NoLossComp.decoderLz77(CompressedLz77);
        LectorCVS.printMatriz(NoLossComp.toMatrizLz(DecompressedLz77));

        // ALGORITMO 2
        LinkedList<LC> CompressedLC = new LinkedList<>();
        CompressedLC = NoLossComp.compressionLC(LectorCVS.getDatasetLC(nombreArchivo), searchBuffer, lookBuffer);
        //ingresar nombre de archivo y escala a comprimir
        LinkedList<String> DecompressedLC = new LinkedList<>();
        DecompressedLC = NoLossComp.decompressionLC(CompressedLC);
        LectorCVS.printMatriz(NoLossComp.toMatrizLC(DecompressedLC));
    }
}
