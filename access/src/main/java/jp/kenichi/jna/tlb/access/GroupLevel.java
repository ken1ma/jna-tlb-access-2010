
package jp.kenichi.jna.tlb.access;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * <p>uuid({BC9E4356-F037-11CD-8701-00AA003F0F07})</p>
 * <p>interface(_GroupLevel)</p>
 */
@ComObject(clsId = "{BC9E4356-F037-11CD-8701-00AA003F0F07}")
public interface GroupLevel extends IUnknown
    ,_GroupLevel
{

}