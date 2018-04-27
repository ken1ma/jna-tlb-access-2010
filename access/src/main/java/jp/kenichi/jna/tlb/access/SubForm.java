
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * <p>uuid({3B06E963-E47C-11CD-8701-00AA003F0F07})</p>
 * <p>source(DispSubFormEvents)</p>
 * <p>source(_SubFormEvents)</p>
 * <p>interface(_SubForm)</p>
 * <p>interface(IConnectionPoint)</p>
 */
@ComObject(clsId = "{3B06E963-E47C-11CD-8701-00AA003F0F07}")
public interface SubForm extends IUnknown
    ,_SubForm
    ,IConnectionPoint
{

}