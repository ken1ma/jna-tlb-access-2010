
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * <p>uuid({8B06E321-B23C-11CF-89A8-00A0C9054129})</p>
 * <p>source(_DummyEvents)</p>
 * <p>interface(_Dummy)</p>
 * <p>interface(IConnectionPoint)</p>
 */
@ComObject(clsId = "{8B06E321-B23C-11CF-89A8-00A0C9054129}")
public interface _Class extends IUnknown
    ,_Dummy
    ,IConnectionPoint
{

}