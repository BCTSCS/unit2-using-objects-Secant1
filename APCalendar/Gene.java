public class Gene {

    String dna;   
    int geneCount;

    Gene(String dna) {
        this.dna = dna;
        this.geneCount = dna.length() % 3;
    }

    static int countNucleotides(String g, char nucleotide) {
        int count = 0;
        for (int i = 0; i < g.length(); i++) {
            if (g.charAt(i) == nucleotide) {
                count++;
            }
        }
        return count;
    }

    
    static String findGenes(String dna, int startIndex) {
        return dna.substring(startIndex);
    }

    static boolean potentialGene(String dna) {
        if (dna.substring(0,3) == "ATG") { return false; }
        if (dna.length() % 3 == 0) {
            String end = dna.substring(dna.length()-3);
            if (end.equals("TAG") || end.equals("TAA") || end.equals("TGA")) {
                return true;
            }
        }
        return false;
    }

    static int findStopCodon( String genome, int start) {

        if (genome.length() % 3 != 0) {return -1;}
    
        for (int i = start; i < genome.length(); i += 3) {
            String codon = genome.substring(i, i+3);
            if (codon.equals("TAA") || codon.equals("TAG") || codon.equals("TGA")) {
                return i;
            }
        }
        return -1;
    }
    

    public static void main(String[] args) {
        String dna = "ATGCGATACGCTTGA";

        System.out.println(dna);
        System.out.println("Number of T Nucleotides: ");
        System.out.println(countNucleotides(dna, 'T'));
        System.out.println("Find Genes starting at 6th Index: ");
        System.out.println(findGenes(dna, 6));
        System.out.println("Is it a gene: ");
        System.out.println(potentialGene(dna));
        System.out.println("First stop codon index: ");
        System.out.println(findStopCodon(dna, 0));
    }

}