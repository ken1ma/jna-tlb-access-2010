
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * <p>uuid({27B378D1-DAE2-48A5-BB40-A1C2BA02631D})</p>
 * <p>interface(_ReturnVar)</p>
 */
@ComObject(clsId = "{27B378D1-DAE2-48A5-BB40-A1C2BA02631D}")
public interface ReturnVar extends IUnknown
    ,_ReturnVar
{

}