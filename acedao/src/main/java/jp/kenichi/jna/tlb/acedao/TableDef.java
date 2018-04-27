
package jp.kenichi.jna.tlb.acedao;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * <p>uuid({367E582C-F71C-4BF9-AA1B-9F62B793E9C5})</p>
 * <p>interface(_TableDef)</p>
 */
@ComObject(clsId = "{367E582C-F71C-4BF9-AA1B-9F62B793E9C5}")
public interface TableDef extends IUnknown
    ,_TableDef
{

}