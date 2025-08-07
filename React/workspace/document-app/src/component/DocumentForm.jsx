import { useRef, useState } from 'react'
import {useReactToPrint} from 'react-to-print'
import LeaveRequestForm from '../form/LeaveRequestForm';

const DocumentForm = () => {
  const documentRef = useRef(null);
  const leaveRef = useRef(null);
  const [data, setData] = useState({
    department: "",
    name:"",
    position:"",
    reason:"",
    start:"",
    end:"",
    tel:"",
    date:useState(new Date().toISOString().slice(0, 10)),
  })
  const handleSubmit = useReactToPrint({
      contentRef:leaveRef,
  })
  const handlePrint = useReactToPrint({
    contentRef : documentRef,
  })
  return (
    <div ref={documentRef} style={{ maxWidth: '800px', margin: 'auto' }}>
      <h2>📄 신청서 작성</h2>
      
      <div style={{ marginBottom: '1rem' }}>
        <label>소속: </label>
        <input
          type="text"
          value={data.department}
          onChange={e => setData({...data,department:e.target.value})}
          style={{ width: '100%', padding: '0.5rem' }}
          placeholder="예: 소속"
        />
      </div>

      <div style={{ marginBottom: '1rem' }}>
        <label>성명: </label>
        <input
          type="text"
          value={data.name}
          onChange={e => setData({...data,name:e.target.value})}
          style={{ width: '100%', padding: '0.5rem' }}
        />
      </div>
      <div style={{ marginBottom: '1rem' }}>
        <label>직위: </label>
        <input
          type="text"
          value={data.position}
          onChange={e => setData({...data,position:e.target.value})}
          style={{ width: '100%', padding: '0.5rem' }}
        />
      </div>
      
      <div style={{ marginBottom: '1rem' }}>
        <label>휴가사유:</label>
        <div style={{ border: '1px solid #ccc', padding: '1rem' }}>
          <textarea value={data.reason} onChange={e => setData({...data,reason:e.target.value})}/>
        </div>
      </div>
      <div style={{ marginBottom: '1rem' }}>
        <label>휴가기간: </label>
        <input
          type="date"
          value={data.start}
          onChange={e => setData({...data,start:e.target.value})}
          style={{ width: '100%', padding: '0.5rem' }}
        />~<input
          type="date"
          value={data.end}
          onChange={e => setData({...data,end:e.target.value})}
          style={{ width: '100%', padding: '0.5rem' }}
        />
      </div>

      <div style={{ marginBottom: '1rem' }}>
        <label>작성일: </label>
        <input
          type="date"
          value={data.date}
          onChange={e => setData({...data,date:e.target.value})}
          style={{ width: '100%', padding: '0.5rem' }}
        />
      </div>
      <div style={{ marginBottom: '1rem' }}>
        <label>비상연락처: </label>
        <input
          type="text"
          value={data.tel}
          onChange={e => setData({...data,tel:e.target.value})}
          style={{ width: '100%', padding: '0.5rem' }}
        />
      </div>

      <button
        onClick={handlePrint}
        style={{
          padding: '0.75rem 1.5rem',
          backgroundColor: '#007bff',
          color: 'white',
          border: 'none',
          borderRadius: '4px',
        }}
      >
        현재 페이지 출력하기
      </button>
      <button
        onClick={handleSubmit}
        style={{
          padding: '0.75rem 1.5rem',
          backgroundColor: '#007bff',
          color: 'white',
          border: 'none',
          borderRadius: '4px',
        }}
      >
        LeaveRequestForm 출력하기
      </button>
      <LeaveRequestForm ref={leaveRef} data={data} />
    </div>
  )
}

export default DocumentForm;
