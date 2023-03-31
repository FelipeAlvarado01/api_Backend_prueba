package WLANS_Books.com.api.Entity;

public enum TipoDocumento {

   CC("C.C"),TI("TI"), CE("C.E"), PEP(" PEP"),
    DNI("DNI"), PA(" PA");

   // CC, TI, CE, PEP, DNI, PA

    String notation;

   TipoDocumento(String notation){
       this.notation=notation;
   }

    public String getNotation() { return notation; }

}
