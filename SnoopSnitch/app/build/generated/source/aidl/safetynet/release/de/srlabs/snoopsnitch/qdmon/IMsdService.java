/*
 * This file is auto-generated.  DO NOT MODIFY.
 * Original file: /root/research/snoopsnitch/SnoopSnitch/app/src/main/aidl/de/srlabs/snoopsnitch/qdmon/IMsdService.aidl
 */
package de.srlabs.snoopsnitch.qdmon;
public interface IMsdService extends android.os.IInterface
{
/** Local-side IPC implementation stub class. */
public static abstract class Stub extends android.os.Binder implements de.srlabs.snoopsnitch.qdmon.IMsdService
{
private static final java.lang.String DESCRIPTOR = "de.srlabs.snoopsnitch.qdmon.IMsdService";
/** Construct the stub at attach it to the interface. */
public Stub()
{
this.attachInterface(this, DESCRIPTOR);
}
/**
 * Cast an IBinder object into an de.srlabs.snoopsnitch.qdmon.IMsdService interface,
 * generating a proxy if needed.
 */
public static de.srlabs.snoopsnitch.qdmon.IMsdService asInterface(android.os.IBinder obj)
{
if ((obj==null)) {
return null;
}
android.os.IInterface iin = obj.queryLocalInterface(DESCRIPTOR);
if (((iin!=null)&&(iin instanceof de.srlabs.snoopsnitch.qdmon.IMsdService))) {
return ((de.srlabs.snoopsnitch.qdmon.IMsdService)iin);
}
return new de.srlabs.snoopsnitch.qdmon.IMsdService.Stub.Proxy(obj);
}
@Override public android.os.IBinder asBinder()
{
return this;
}
@Override public boolean onTransact(int code, android.os.Parcel data, android.os.Parcel reply, int flags) throws android.os.RemoteException
{
switch (code)
{
case INTERFACE_TRANSACTION:
{
reply.writeString(DESCRIPTOR);
return true;
}
case TRANSACTION_isRecording:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.isRecording();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_registerCallback:
{
data.enforceInterface(DESCRIPTOR);
de.srlabs.snoopsnitch.qdmon.IMsdServiceCallback _arg0;
_arg0 = de.srlabs.snoopsnitch.qdmon.IMsdServiceCallback.Stub.asInterface(data.readStrongBinder());
this.registerCallback(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_startRecording:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.startRecording();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_stopRecording:
{
data.enforceInterface(DESCRIPTOR);
boolean _result = this.stopRecording();
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_exitService:
{
data.enforceInterface(DESCRIPTOR);
this.exitService();
reply.writeNoException();
return true;
}
case TRANSACTION_getServiceStartTime:
{
data.enforceInterface(DESCRIPTOR);
long _result = this.getServiceStartTime();
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_writeLog:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
this.writeLog(_arg0);
reply.writeNoException();
return true;
}
case TRANSACTION_getExtraRecordingId:
{
data.enforceInterface(DESCRIPTOR);
long _result = this.getExtraRecordingId();
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_startExtraRecording:
{
data.enforceInterface(DESCRIPTOR);
java.lang.String _arg0;
_arg0 = data.readString();
boolean _result = this.startExtraRecording(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_endExtraRecording:
{
data.enforceInterface(DESCRIPTOR);
boolean _arg0;
_arg0 = (0!=data.readInt());
boolean _result = this.endExtraRecording(_arg0);
reply.writeNoException();
reply.writeInt(((_result)?(1):(0)));
return true;
}
case TRANSACTION_startActiveTest:
{
data.enforceInterface(DESCRIPTOR);
this.startActiveTest();
reply.writeNoException();
return true;
}
case TRANSACTION_stopActiveTest:
{
data.enforceInterface(DESCRIPTOR);
this.stopActiveTest();
reply.writeNoException();
return true;
}
case TRANSACTION_triggerUploading:
{
data.enforceInterface(DESCRIPTOR);
this.triggerUploading();
reply.writeNoException();
return true;
}
case TRANSACTION_reopenAndUploadDebugLog:
{
data.enforceInterface(DESCRIPTOR);
long _result = this.reopenAndUploadDebugLog();
reply.writeNoException();
reply.writeLong(_result);
return true;
}
case TRANSACTION_getParserNetworkGeneration:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getParserNetworkGeneration();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getDiagMsgCount:
{
data.enforceInterface(DESCRIPTOR);
int _result = this.getDiagMsgCount();
reply.writeNoException();
reply.writeInt(_result);
return true;
}
case TRANSACTION_getLastAnalysisTimeMs:
{
data.enforceInterface(DESCRIPTOR);
long _result = this.getLastAnalysisTimeMs();
reply.writeNoException();
reply.writeLong(_result);
return true;
}
}
return super.onTransact(code, data, reply, flags);
}
private static class Proxy implements de.srlabs.snoopsnitch.qdmon.IMsdService
{
private android.os.IBinder mRemote;
Proxy(android.os.IBinder remote)
{
mRemote = remote;
}
@Override public android.os.IBinder asBinder()
{
return mRemote;
}
public java.lang.String getInterfaceDescriptor()
{
return DESCRIPTOR;
}
// Recording

@Override public boolean isRecording() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_isRecording, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void registerCallback(de.srlabs.snoopsnitch.qdmon.IMsdServiceCallback callback) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeStrongBinder((((callback!=null))?(callback.asBinder()):(null)));
mRemote.transact(Stub.TRANSACTION_registerCallback, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public boolean startRecording() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_startRecording, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean stopRecording() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_stopRecording, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void exitService() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_exitService, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
// Needed for DummyMsdService

@Override public long getServiceStartTime() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getServiceStartTime, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// Reporting log messages from UI or ActiveTestService to the central LOG written by MsdService

@Override public void writeLog(java.lang.String logData) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(logData);
mRemote.transact(Stub.TRANSACTION_writeLog, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
// Extra file recording for active test:

@Override public long getExtraRecordingId() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getExtraRecordingId, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean startExtraRecording(java.lang.String filename) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeString(filename);
mRemote.transact(Stub.TRANSACTION_startExtraRecording, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public boolean endExtraRecording(boolean markForUpload) throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
boolean _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
_data.writeInt(((markForUpload)?(1):(0)));
mRemote.transact(Stub.TRANSACTION_endExtraRecording, _data, _reply, 0);
_reply.readException();
_result = (0!=_reply.readInt());
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public void startActiveTest() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_startActiveTest, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
@Override public void stopActiveTest() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_stopActiveTest, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
// Uploading

@Override public void triggerUploading() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_triggerUploading, _data, _reply, 0);
_reply.readException();
}
finally {
_reply.recycle();
_data.recycle();
}
}
// Retopens the debug log and marks it for uploading

@Override public long reopenAndUploadDebugLog() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_reopenAndUploadDebugLog, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getParserNetworkGeneration() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getParserNetworkGeneration, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
@Override public int getDiagMsgCount() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
int _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getDiagMsgCount, _data, _reply, 0);
_reply.readException();
_result = _reply.readInt();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
// Gets the last analysis time (or 0) of the currently running MsdServer instance

@Override public long getLastAnalysisTimeMs() throws android.os.RemoteException
{
android.os.Parcel _data = android.os.Parcel.obtain();
android.os.Parcel _reply = android.os.Parcel.obtain();
long _result;
try {
_data.writeInterfaceToken(DESCRIPTOR);
mRemote.transact(Stub.TRANSACTION_getLastAnalysisTimeMs, _data, _reply, 0);
_reply.readException();
_result = _reply.readLong();
}
finally {
_reply.recycle();
_data.recycle();
}
return _result;
}
}
static final int TRANSACTION_isRecording = (android.os.IBinder.FIRST_CALL_TRANSACTION + 0);
static final int TRANSACTION_registerCallback = (android.os.IBinder.FIRST_CALL_TRANSACTION + 1);
static final int TRANSACTION_startRecording = (android.os.IBinder.FIRST_CALL_TRANSACTION + 2);
static final int TRANSACTION_stopRecording = (android.os.IBinder.FIRST_CALL_TRANSACTION + 3);
static final int TRANSACTION_exitService = (android.os.IBinder.FIRST_CALL_TRANSACTION + 4);
static final int TRANSACTION_getServiceStartTime = (android.os.IBinder.FIRST_CALL_TRANSACTION + 5);
static final int TRANSACTION_writeLog = (android.os.IBinder.FIRST_CALL_TRANSACTION + 6);
static final int TRANSACTION_getExtraRecordingId = (android.os.IBinder.FIRST_CALL_TRANSACTION + 7);
static final int TRANSACTION_startExtraRecording = (android.os.IBinder.FIRST_CALL_TRANSACTION + 8);
static final int TRANSACTION_endExtraRecording = (android.os.IBinder.FIRST_CALL_TRANSACTION + 9);
static final int TRANSACTION_startActiveTest = (android.os.IBinder.FIRST_CALL_TRANSACTION + 10);
static final int TRANSACTION_stopActiveTest = (android.os.IBinder.FIRST_CALL_TRANSACTION + 11);
static final int TRANSACTION_triggerUploading = (android.os.IBinder.FIRST_CALL_TRANSACTION + 12);
static final int TRANSACTION_reopenAndUploadDebugLog = (android.os.IBinder.FIRST_CALL_TRANSACTION + 13);
static final int TRANSACTION_getParserNetworkGeneration = (android.os.IBinder.FIRST_CALL_TRANSACTION + 14);
static final int TRANSACTION_getDiagMsgCount = (android.os.IBinder.FIRST_CALL_TRANSACTION + 15);
static final int TRANSACTION_getLastAnalysisTimeMs = (android.os.IBinder.FIRST_CALL_TRANSACTION + 16);
}
// Recording

public boolean isRecording() throws android.os.RemoteException;
public void registerCallback(de.srlabs.snoopsnitch.qdmon.IMsdServiceCallback callback) throws android.os.RemoteException;
public boolean startRecording() throws android.os.RemoteException;
public boolean stopRecording() throws android.os.RemoteException;
public void exitService() throws android.os.RemoteException;
// Needed for DummyMsdService

public long getServiceStartTime() throws android.os.RemoteException;
// Reporting log messages from UI or ActiveTestService to the central LOG written by MsdService

public void writeLog(java.lang.String logData) throws android.os.RemoteException;
// Extra file recording for active test:

public long getExtraRecordingId() throws android.os.RemoteException;
public boolean startExtraRecording(java.lang.String filename) throws android.os.RemoteException;
public boolean endExtraRecording(boolean markForUpload) throws android.os.RemoteException;
public void startActiveTest() throws android.os.RemoteException;
public void stopActiveTest() throws android.os.RemoteException;
// Uploading

public void triggerUploading() throws android.os.RemoteException;
// Retopens the debug log and marks it for uploading

public long reopenAndUploadDebugLog() throws android.os.RemoteException;
public int getParserNetworkGeneration() throws android.os.RemoteException;
public int getDiagMsgCount() throws android.os.RemoteException;
// Gets the last analysis time (or 0) of the currently running MsdServer instance

public long getLastAnalysisTimeMs() throws android.os.RemoteException;
}
