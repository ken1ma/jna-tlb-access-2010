
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({00000500-0000-0010-8000-00AA006D2EA4})</p>
 */
@ComInterface(iid="{00000500-0000-0010-8000-00AA006D2EA4}")
public interface Error extends IUnknown, IRawDispatchHandle, IDispatch {
    /**
     * <p>id(0x1)</p>
     * <p>vtableId(7)</p>
     */
    @ComProperty(name = "Number", dispId = 0x1)
    Integer getNumber();
            
    /**
     * <p>id(0x2)</p>
     * <p>vtableId(8)</p>
     */
    @ComProperty(name = "Source", dispId = 0x2)
    String getSource();
            
    /**
     * <p>id(0x0)</p>
     * <p>vtableId(9)</p>
     */
    @ComProperty(name = "Description", dispId = 0x0)
    String getDescription();
            
    /**
     * <p>id(0x3)</p>
     * <p>vtableId(10)</p>
     */
    @ComProperty(name = "HelpFile", dispId = 0x3)
    String getHelpFile();
            
    /**
     * <p>id(0x4)</p>
     * <p>vtableId(11)</p>
     */
    @ComProperty(name = "HelpContext", dispId = 0x4)
    Integer getHelpContext();
            
    /**
     * <p>id(0x5)</p>
     * <p>vtableId(12)</p>
     */
    @ComProperty(name = "SQLState", dispId = 0x5)
    String getSQLState();
            
    /**
     * <p>id(0x6)</p>
     * <p>vtableId(13)</p>
     */
    @ComProperty(name = "NativeError", dispId = 0x6)
    Integer getNativeError();
            
    
}