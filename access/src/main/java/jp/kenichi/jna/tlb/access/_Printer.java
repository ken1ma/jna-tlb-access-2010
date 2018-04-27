
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({DBC5175F-A8ED-11D3-A0DD-00C04F68712B})</p>
 */
@ComInterface(iid="{DBC5175F-A8ED-11D3-A0DD-00C04F68712B}")
public interface _Printer extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x926)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "ColorMode", dispId = 0x926)
    AcPrintColor getColorMode();
            
    /**
     * <p>id(0x926)</p>
     * <p>vtableId(8)</p>
     * @param param0 [in] {@code AcPrintColor}
     */
    @ComProperty(name = "ColorMode", dispId = 0x926)
    void setColorMode(AcPrintColor param0);
            
    /**
     * <p>id(0x927)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Copies", dispId = 0x927)
    Integer getCopies();
            
    /**
     * <p>id(0x927)</p>
     * <p>vtableId(10)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "Copies", dispId = 0x927)
    void setCopies(Integer param0);
            
    /**
     * <p>id(0x928)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "DeviceName", dispId = 0x928)
    String getDeviceName();
            
    /**
     * <p>id(0x929)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "DriverName", dispId = 0x929)
    String getDriverName();
            
    /**
     * <p>id(0x92a)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "Duplex", dispId = 0x92a)
    AcPrintDuplex getDuplex();
            
    /**
     * <p>id(0x92a)</p>
     * <p>vtableId(14)</p>
     * @param param0 [in] {@code AcPrintDuplex}
     */
    @ComProperty(name = "Duplex", dispId = 0x92a)
    void setDuplex(AcPrintDuplex param0);
            
    /**
     * <p>id(0x92b)</p>
     * <p>vtableId(15)</p>
     */
    @ComProperty(name = "Orientation", dispId = 0x92b)
    AcPrintOrientation getOrientation();
            
    /**
     * <p>id(0x92b)</p>
     * <p>vtableId(16)</p>
     * @param param0 [in] {@code AcPrintOrientation}
     */
    @ComProperty(name = "Orientation", dispId = 0x92b)
    void setOrientation(AcPrintOrientation param0);
            
    /**
     * <p>id(0x92c)</p>
     * <p>vtableId(17)</p>
     */
    @ComProperty(name = "PaperBin", dispId = 0x92c)
    AcPrintPaperBin getPaperBin();
            
    /**
     * <p>id(0x92c)</p>
     * <p>vtableId(18)</p>
     * @param param0 [in] {@code AcPrintPaperBin}
     */
    @ComProperty(name = "PaperBin", dispId = 0x92c)
    void setPaperBin(AcPrintPaperBin param0);
            
    /**
     * <p>id(0x92d)</p>
     * <p>vtableId(19)</p>
     */
    @ComProperty(name = "PaperSize", dispId = 0x92d)
    AcPrintPaperSize getPaperSize();
            
    /**
     * <p>id(0x92d)</p>
     * <p>vtableId(20)</p>
     * @param param0 [in] {@code AcPrintPaperSize}
     */
    @ComProperty(name = "PaperSize", dispId = 0x92d)
    void setPaperSize(AcPrintPaperSize param0);
            
    /**
     * <p>id(0x92e)</p>
     * <p>vtableId(21)</p>
     */
    @ComProperty(name = "Port", dispId = 0x92e)
    String getPort();
            
    /**
     * <p>id(0x92f)</p>
     * <p>vtableId(22)</p>
     */
    @ComProperty(name = "PrintQuality", dispId = 0x92f)
    AcPrintObjQuality getPrintQuality();
            
    /**
     * <p>id(0x92f)</p>
     * <p>vtableId(23)</p>
     * @param param0 [in] {@code AcPrintObjQuality}
     */
    @ComProperty(name = "PrintQuality", dispId = 0x92f)
    void setPrintQuality(AcPrintObjQuality param0);
            
    /**
     * <p>id(0x930)</p>
     * <p>vtableId(24)</p>
     */
    @ComProperty(name = "LeftMargin", dispId = 0x930)
    Integer getLeftMargin();
            
    /**
     * <p>id(0x930)</p>
     * <p>vtableId(25)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "LeftMargin", dispId = 0x930)
    void setLeftMargin(Integer param0);
            
    /**
     * <p>id(0x931)</p>
     * <p>vtableId(26)</p>
     */
    @ComProperty(name = "RightMargin", dispId = 0x931)
    Integer getRightMargin();
            
    /**
     * <p>id(0x931)</p>
     * <p>vtableId(27)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "RightMargin", dispId = 0x931)
    void setRightMargin(Integer param0);
            
    /**
     * <p>id(0x932)</p>
     * <p>vtableId(28)</p>
     */
    @ComProperty(name = "TopMargin", dispId = 0x932)
    Integer getTopMargin();
            
    /**
     * <p>id(0x932)</p>
     * <p>vtableId(29)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "TopMargin", dispId = 0x932)
    void setTopMargin(Integer param0);
            
    /**
     * <p>id(0x933)</p>
     * <p>vtableId(30)</p>
     */
    @ComProperty(name = "BottomMargin", dispId = 0x933)
    Integer getBottomMargin();
            
    /**
     * <p>id(0x933)</p>
     * <p>vtableId(31)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "BottomMargin", dispId = 0x933)
    void setBottomMargin(Integer param0);
            
    /**
     * <p>id(0x934)</p>
     * <p>vtableId(32)</p>
     */
    @ComProperty(name = "DataOnly", dispId = 0x934)
    Boolean getDataOnly();
            
    /**
     * <p>id(0x934)</p>
     * <p>vtableId(33)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DataOnly", dispId = 0x934)
    void setDataOnly(Boolean param0);
            
    /**
     * <p>id(0x935)</p>
     * <p>vtableId(34)</p>
     */
    @ComProperty(name = "ItemsAcross", dispId = 0x935)
    Integer getItemsAcross();
            
    /**
     * <p>id(0x935)</p>
     * <p>vtableId(35)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "ItemsAcross", dispId = 0x935)
    void setItemsAcross(Integer param0);
            
    /**
     * <p>id(0x936)</p>
     * <p>vtableId(36)</p>
     */
    @ComProperty(name = "RowSpacing", dispId = 0x936)
    Integer getRowSpacing();
            
    /**
     * <p>id(0x936)</p>
     * <p>vtableId(37)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "RowSpacing", dispId = 0x936)
    void setRowSpacing(Integer param0);
            
    /**
     * <p>id(0x937)</p>
     * <p>vtableId(38)</p>
     */
    @ComProperty(name = "ColumnSpacing", dispId = 0x937)
    Integer getColumnSpacing();
            
    /**
     * <p>id(0x937)</p>
     * <p>vtableId(39)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "ColumnSpacing", dispId = 0x937)
    void setColumnSpacing(Integer param0);
            
    /**
     * <p>id(0x938)</p>
     * <p>vtableId(40)</p>
     */
    @ComProperty(name = "DefaultSize", dispId = 0x938)
    Boolean getDefaultSize();
            
    /**
     * <p>id(0x938)</p>
     * <p>vtableId(41)</p>
     * @param param0 [in] {@code Boolean}
     */
    @ComProperty(name = "DefaultSize", dispId = 0x938)
    void setDefaultSize(Boolean param0);
            
    /**
     * <p>id(0x939)</p>
     * <p>vtableId(42)</p>
     */
    @ComProperty(name = "ItemSizeWidth", dispId = 0x939)
    Integer getItemSizeWidth();
            
    /**
     * <p>id(0x939)</p>
     * <p>vtableId(43)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "ItemSizeWidth", dispId = 0x939)
    void setItemSizeWidth(Integer param0);
            
    /**
     * <p>id(0x93a)</p>
     * <p>vtableId(44)</p>
     */
    @ComProperty(name = "ItemSizeHeight", dispId = 0x93a)
    Integer getItemSizeHeight();
            
    /**
     * <p>id(0x93a)</p>
     * <p>vtableId(45)</p>
     * @param param0 [in] {@code Integer}
     */
    @ComProperty(name = "ItemSizeHeight", dispId = 0x93a)
    void setItemSizeHeight(Integer param0);
            
    /**
     * <p>id(0x93b)</p>
     * <p>vtableId(46)</p>
     */
    @ComProperty(name = "ItemLayout", dispId = 0x93b)
    AcPrintItemLayout getItemLayout();
            
    /**
     * <p>id(0x93b)</p>
     * <p>vtableId(47)</p>
     * @param param0 [in] {@code AcPrintItemLayout}
     */
    @ComProperty(name = "ItemLayout", dispId = 0x93b)
    void setItemLayout(AcPrintItemLayout param0);
            
    /**
     * <p>id(0x990)</p>
     * <p>vtableId(48)</p>
     * @param dispid [in] {@code Integer}
     */
    @ComMethod(name = "IsMemberSafe", dispId = 0x990)
    Boolean IsMemberSafe(Integer dispid);
            
    
}