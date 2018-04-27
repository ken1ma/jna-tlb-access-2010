
package jp.kenichi.jna.tlb.acedao;

import com.sun.jna.platform.win32.COM.COMException;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackCookie;
import com.sun.jna.platform.win32.COM.util.IComEventCallbackListener;
import com.sun.jna.platform.win32.COM.util.IConnectionPoint;
import com.sun.jna.platform.win32.COM.util.IUnknown;
import com.sun.jna.platform.win32.COM.util.annotation.ComObject;
import com.sun.jna.platform.win32.COM.util.IRawDispatchHandle;

/**
 * <p>uuid({D5EC4D34-77DA-4F7A-B8C4-8A910C1C1CFE})</p>
 * <p>interface(_QueryDef)</p>
 */
@ComObject(clsId = "{D5EC4D34-77DA-4F7A-B8C4-8A910C1C1CFE}")
public interface QueryDef extends IUnknown
    ,_QueryDef
{

}