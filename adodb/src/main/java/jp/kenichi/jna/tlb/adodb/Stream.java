
package jp.kenichi.jna.tlb.adodb;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * <p>uuid({00000566-0000-0010-8000-00AA006D2EA4})</p>
 * <p>interface(_Stream)</p>
 */
@ComObject(clsId = "{00000566-0000-0010-8000-00AA006D2EA4}")
public interface Stream extends IUnknown
    ,_Stream
{

}