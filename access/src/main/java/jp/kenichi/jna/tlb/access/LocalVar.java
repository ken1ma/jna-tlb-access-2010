
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * <p>uuid({8357BB51-95A2-4043-A040-2825FACEF50D})</p>
 * <p>interface(_LocalVar)</p>
 */
@ComObject(clsId = "{8357BB51-95A2-4043-A040-2825FACEF50D}")
public interface LocalVar extends IUnknown
    ,_LocalVar
{

}