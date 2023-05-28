using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Timers;
using System.Diagnostics;

namespace C__Assign_Team9
{
    public partial class Form2 : Form
    {

        public Form2()
        {
            InitializeComponent();
        }

        private void Form2_Load(object sender, EventArgs e)
        {
            button1.FlatAppearance.BorderSize = 0;
        }

        private void button1_Click(object sender, EventArgs e)
        {

        }

        private void textBox1_TextChanged(object sender, EventArgs e)
        {

        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void progressBar1_Click(object sender, EventArgs e)
        {
            ProgressBarIncrease(sender);
        }

        private void progressBar2_Click(object sender, EventArgs e)
        {
            ProgressBarIncrease(sender);
        }

        public void ProgressBarIncrease(object sender) // 프로그레스바의 값을 증가시키는 함수
        {
            int step = 1;

            ProgressBar progressBar = (ProgressBar)sender;

            while (progressBar.Value < progressBar.Maximum)
            {
                progressBar.Value += step;
                CharacterImage1.Location = new Point(CharacterImage1.Location.X + step, CharacterImage1.Location.Y);
                CharacterImage1.Refresh();

            }
        }

        private void CharacterImage1_Click(object sender, EventArgs e)
        {
        }

        private void label2_Click(object sender, EventArgs e)
        {

        }
    }
}
