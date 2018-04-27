
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * <p>uuid({044E54C5-B19B-11CE-A689-00AA003F0F07})</p>
 * <p>interface(_AccessField)</p>
 */
@ComObject(clsId = "{044E54C5-B19B-11CE-A689-00AA003F0F07}")
public interface AccessField extends IUnknown
    ,_AccessField
{

}