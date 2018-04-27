
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * <p>uuid({50D56610-60AC-11CF-82C9-00AA004B9FE6})</p>
 * <p>interface(_Hyperlink)</p>
 */
@ComObject(clsId = "{50D56610-60AC-11CF-82C9-00AA004B9FE6}")
public interface Hyperlink extends IUnknown
    ,_Hyperlink
{

}