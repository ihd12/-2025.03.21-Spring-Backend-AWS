import React from 'react';

const LeaveRequestForm = ({data, ref}) => {
  return (
    <div ref={ref} style={{ fontFamily: 'Malgun Gothic, sans-serif', margin: '30px' }}>
      <h2 style={{ textAlign: 'center' }}>연차유급휴가 신청서</h2>

      <div style={{
        float: 'right',
        border: '1px solid #000',
        width: '150px',
        textAlign: 'center',
        marginBottom: '20px'
      }}>
        <table style={{ width: '100%', borderCollapse: 'collapse' }}>
          <thead>
            <tr>
              <th rowSpan="2" style={{ border: '1px solid #000', padding: '5px' }}>결<br />재</th>
              <th style={{ border: '1px solid #000', padding: '5px' }}>담당</th>
              <th style={{ border: '1px solid #000', padding: '5px' }}>대표</th>
            </tr>
          </thead>
          <tbody>
            <tr>
              <td style={{ border: '1px solid #000', height: '40px' }}></td>
              <td style={{ border: '1px solid #000' }}></td>
            </tr>
          </tbody>
        </table>
      </div>

      <table style={{
        width: '100%',
        borderCollapse: 'collapse',
        marginTop: '20px',
        marginBottom: '30px'
      }}>
        <tbody>
          <tr>
            <th style={{ width: '15%', border: '1px solid #000', padding: '10px' }}>소&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;속</th>
            <td style={{ border: '1px solid #000', padding: '10px' }}>{data.department}</td>
          </tr>
          <tr>
            <th style={{ border: '1px solid #000', padding: '10px' }}>성&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;명</th>
            <td style={{ border: '1px solid #000', padding: '10px' }}>{data.name}</td>
          </tr>
          <tr>
            <th style={{ border: '1px solid #000', padding: '10px' }}>직&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;위</th>
            <td style={{ border: '1px solid #000', padding: '10px' }}>{data.position}</td>
          </tr>
          <tr>
            <th style={{ border: '1px solid #000', padding: '10px' }}>휴가 사유</th>
            <td style={{ border: '1px solid #000', padding: '10px', height: '80px' }}>{data.reason}</td>
          </tr>
          <tr>
            <th style={{ border: '1px solid #000', padding: '10px' }}>휴가 기간</th>
            <td style={{ border: '1px solid #000', padding: '10px' }}>
              {/* 20&nbsp;&nbsp;&nbsp;년&nbsp;&nbsp;&nbsp;월&nbsp;&nbsp;&nbsp;일 부터<br />
              20&nbsp;&nbsp;&nbsp;년&nbsp;&nbsp;&nbsp;월&nbsp;&nbsp;&nbsp;일까지 */}
              {data.start} 부터<br />
              {data.end} 일까지
              (<span style={{ display: 'inline-block', width: '60px', borderBottom: '1px solid #000' }}></span> 일간)
            </td>
          </tr>
          <tr>
            <th style={{ border: '1px solid #000', padding: '10px' }}>비상연락처</th>
            <td style={{ border: '1px solid #000', padding: '10px' }}>{data.tel}</td>
          </tr>
          <tr>
            <td colSpan="2" style={{
              border: '1px solid #000',
              padding: '20px',
              textAlign: 'center',
              height: '100px'
            }}>
              위와 같이 <strong>휴가</strong>를 신청하오니 재가하여 주시기 바랍니다.<br /><br />
              {/* 20&nbsp;&nbsp;&nbsp;년&nbsp;&nbsp;&nbsp;월&nbsp;&nbsp;&nbsp;일 */}
              {data.date}
              <div style={{ textAlign: 'right', marginTop: '40px' }}>
                성명 : <span style={{ display: 'inline-block', width: '100px', borderBottom: '1px solid #000' }}></span> (인)
              </div>
            </td>
          </tr>
        </tbody>
      </table>
    </div>
  );
};

export default LeaveRequestForm;
