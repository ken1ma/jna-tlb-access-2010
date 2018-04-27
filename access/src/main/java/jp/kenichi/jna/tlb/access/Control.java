
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * <p>uuid({02F92C80-8F8E-101B-AF4E-00AA003F0F07})</p>
 * <p>interface(_Control)</p>
 */
@ComObject(clsId = "{02F92C80-8F8E-101B-AF4E-00AA003F0F07}")
public interface Control extends IUnknown
    ,_Control
{

}