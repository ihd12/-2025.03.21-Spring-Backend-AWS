import { useState } from "react";
import Button from "../component/ui/Button";
import Header from "../component/ui/Header";
const Home = () =>{
    const [pivotDate, setPivotDate] = useState(new Date());
    // 자바스크립트 getMonth()는 0~11월까지로 계산하기 때문에 +1 이 필요함
    const headerTitle = `${pivotDate.getFullYear()}년 ${pivotDate.getMonth()+1}월`;
    const onIncreaseMonth = () =>{
        setPivotDate(new Date(pivotDate.getFullYear(), pivotDate.getMonth()+1));
    }
    const onDecreaseMonth = () =>{
        setPivotDate(new Date(pivotDate.getFullYear(), pivotDate.getMonth()-1));
    }
    return (
        <div>
            <Header
            title={headerTitle}
            leftChild={<Button text="<" onClick={onDecreaseMonth}/>}
            rightChild={<Button text=">" onClick={onIncreaseMonth}/>}
            />
        </div>
    );
}
export default Home;