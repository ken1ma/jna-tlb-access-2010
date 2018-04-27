
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.util.annotation.ComInterface;
import com.sun.jna.platform.win32.COM.util.annotation.ComMethod;
import com.sun.jna.platform.win32.COM.util.annotation.ComProperty;
import com.sun.jna.platform.win32.COM.util.IDispatch;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;
import com.sun.jna.platform.win32.Variant.VARIANT;

/**
 * <p>uuid({3B06E988-E47C-11CD-8701-00AA003F0F07})</p>
 */
@ComInterface(iid="{3B06E988-E47C-11CD-8701-00AA003F0F07}")
public interface DispEmptyCellEvents extends IUnknown, IRawDispatchHandle, IDispatch {
    
}