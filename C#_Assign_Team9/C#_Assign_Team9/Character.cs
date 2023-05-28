using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

// 캐릭터 정보저장 클래스

namespace C__Assign_Team9
{
    internal class Character
    {
        string name; // 캐릭터 이름
        string speed; // 캐릭터 속도
        string[] skillList; // 스킬이름 항목
        
        public Character(string name, string speed)
        {
            this.name = name;
            this.speed = speed;
            skillList = new string[0];
        }
    }
}
