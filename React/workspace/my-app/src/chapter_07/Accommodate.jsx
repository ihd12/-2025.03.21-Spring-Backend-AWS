import { useEffect, useState } from "react";
import useCounter from "./useCounter";

// 입장가능한 인원의 최대값을 10명으로 설정
const MAX_CAPACITY = 10;

function Accommodate(props){

    const [isFull, setIsFull] = useState(false);
    // 커스텀 훅을 이용하여 필요한 변수 및 함수 저장
    const [count, increaseCount, decreaseCount] = useCounter(0);
    useEffect(()=>{
        console.log("======================");
        console.log("useEffect() is called.");
        console.log(`isFull: ${isFull}`);
    })
    // 카운트 값이 변결될때마다 실행되는 useEffect
    useEffect(()=>{
        // count가 10되면 isFull을 true로 변경
        // count 10보다 작으면 isFull을 false변경
        setIsFull(count >= MAX_CAPACITY)
        console.log(`Current count value: ${count}`);
    },[count]);

    return (
        <div style={{padding:16}}>
            <p>{`총 ${count}명 수용했습니다.`}</p>
            <button onClick={increaseCount} disabled={isFull}>
                입장
            </button>
            <button onClick={decreaseCount}>퇴장</button>
            {isFull && <p style={{color:"red"}}>정원이 가득찼습니다.</p>}
        </div>
    );
}
export default Accommodate;