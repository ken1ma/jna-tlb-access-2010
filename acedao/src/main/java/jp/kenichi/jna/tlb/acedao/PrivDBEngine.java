
package jp.kenichi.jna.tlb.acedao;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * DAO 3.0 DBEngine (private)
 *
 * <p>uuid({6F3DD387-5AF2-492B-BDE2-30FF2F451241})</p>
 * <p>interface(_DBEngine)</p>
 */
@ComObject(clsId = "{6F3DD387-5AF2-492B-BDE2-30FF2F451241}")
public interface PrivDBEngine extends IUnknown
    ,_DBEngine
{

}