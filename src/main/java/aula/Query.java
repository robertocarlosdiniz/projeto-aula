package aula;

public class Query {

    public static final String QUERY = "SELECT\n" +
            "                    B.CD_PVVDT_PRC_VND\n" +
            "                    ,B.CD_PVVDT_DOC_PRC\n" +
            "                    ,C.CD_LPVVDT_LOT_PRC\n" +
            "                    ,D.CD_MLVVDT_MCR_WMS\n" +
            "                    ,D.CD_MCR\n" +
            "                    ,E.DS_MCR\n" +
            "                    ,D.VR_MLVVDT_MIN_VND\n" +
            "                    ,D.VR_MLVVDT_CUS_MCR\n" +
            "                FROM  REQ_RMS_AST     A\n" +
            "                    ,PRC_VNL_VDT     B\n" +
            "                    ,LOT_PRC_VNL_VDT C\n" +
            "                    ,MCR_LOT_VNL_VDT D\n" +
            "                    ,MCR             E\n" +
            "                WHERE A.CD_RRAST               = B.CD_PVVDT_PRC_VND    \n" +
            "                    AND   B.CD_EMPGCB_PRC_VND  = C.CD_EMPGCB_PRC_VND\n" +
            "                    AND   B.CD_FIL_PRC_VND     = C.CD_FIL_PRC_VND\n" +
            "                    AND   B.CD_PVVDT_PRC_VND   = C.CD_PVVDT_PRC_VND\n" +
            "                    AND   B.CD_EPSRV           = C.CD_EPSRV\n" +
            "                    AND   C.CD_EMPGCB_PRC_VND  = D.CD_EMPGCB_PRC_VND\n" +
            "                    AND   C.CD_FIL_PRC_VND     = D.CD_FIL_PRC_VND\n" +
            "                    AND   C.CD_PVVDT_PRC_VND   = D.CD_PVVDT_PRC_VND\n" +
            "                    AND   C.CD_EPSRV           = D.CD_EPSRV\n" +
            "                    AND   C.CD_LPVVDT_LOT_PRC  = D.CD_LPVVDT_LOT_PRC\n" +
            "                    AND   D.CD_MCR             = E.CD_MCR\n" +
            "                ORDER BY 2,3,4";

    public static final String QUERY_MCR = "SELECT\n" +
            "                    E.*\n" +
            "                FROM  REQ_RMS_AST     A\n" +
            "                    ,PRC_VNL_VDT     B\n" +
            "                    ,LOT_PRC_VNL_VDT C\n" +
            "                    ,MCR_LOT_VNL_VDT D\n" +
            "                    ,MCR             E\n" +
            "                WHERE A.CD_RRAST               = B.CD_PVVDT_PRC_VND    \n" +
            "                    AND   B.CD_EMPGCB_PRC_VND  = C.CD_EMPGCB_PRC_VND\n" +
            "                    AND   B.CD_FIL_PRC_VND     = C.CD_FIL_PRC_VND\n" +
            "                    AND   B.CD_PVVDT_PRC_VND   = C.CD_PVVDT_PRC_VND\n" +
            "                    AND   B.CD_EPSRV           = C.CD_EPSRV\n" +
            "                    AND   C.CD_EMPGCB_PRC_VND  = D.CD_EMPGCB_PRC_VND\n" +
            "                    AND   C.CD_FIL_PRC_VND     = D.CD_FIL_PRC_VND\n" +
            "                    AND   C.CD_PVVDT_PRC_VND   = D.CD_PVVDT_PRC_VND\n" +
            "                    AND   C.CD_EPSRV           = D.CD_EPSRV\n" +
            "                    AND   C.CD_LPVVDT_LOT_PRC  = D.CD_LPVVDT_LOT_PRC\n" +
            "                    AND   D.CD_MCR             = E.CD_MCR\n" +
            "                ORDER BY 2,3,4";
}
