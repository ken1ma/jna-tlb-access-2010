
package jp.kenichi.jna.tlb.office;

import com.sun.jna.platform.win32.COM.util.annotation.ComEventCallback;
import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({000CDB07-0000-0000-C000-000000000046})</p>
 */
@ComInterface(iid="{000CDB07-0000-0000-C000-000000000046}")
public interface _CustomXMLPartEventsListener {
    /**
     * <p>id(0x1)</p>
     */
    @ComEventCallback(dispid = 0x1)
    void NodeAfterInsert(CustomXMLNode NewNode,
            Boolean InUndoRedo);
            
    /**
     * <p>id(0x2)</p>
     */
    @ComEventCallback(dispid = 0x2)
    void NodeAfterDelete(CustomXMLNode OldNode,
            CustomXMLNode OldParentNode,
            CustomXMLNode OldNextSibling,
            Boolean InUndoRedo);
            
    /**
     * <p>id(0x3)</p>
     */
    @ComEventCallback(dispid = 0x3)
    void NodeAfterReplace(CustomXMLNode OldNode,
            CustomXMLNode NewNode,
            Boolean InUndoRedo);
            
    
}