
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * <p>uuid({73A4C9C1-D68D-11D0-98BF-00A0C90DC8D9})</p>
 * <p>interface(_Application)</p>
 */
@ComObject(clsId = "{73A4C9C1-D68D-11D0-98BF-00A0C90DC8D9}")
public interface Application extends IUnknown
    ,_Application
{

}