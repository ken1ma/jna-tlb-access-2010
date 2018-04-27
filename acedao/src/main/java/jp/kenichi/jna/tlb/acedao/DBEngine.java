
package jp.kenichi.jna.tlb.acedao;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * <p>uuid({CD7791B9-43FD-42C5-AE42-8DD2811F0419})</p>
 * <p>interface(_DBEngine)</p>
 */
@ComObject(clsId = "{CD7791B9-43FD-42C5-AE42-8DD2811F0419}")
public interface DBEngine extends IUnknown
    ,_DBEngine
{

}