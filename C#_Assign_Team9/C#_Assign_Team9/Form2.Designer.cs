namespace C__Assign_Team9
{
    partial class Form2
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Form2));
            button1 = new Button();
            label1 = new Label();
            progressBar1 = new ProgressBar();
            progressBar2 = new ProgressBar();
            CharacterImage1 = new PictureBox();
            label2 = new Label();
            ((System.ComponentModel.ISupportInitialize)CharacterImage1).BeginInit();
            SuspendLayout();
            // 
            // button1
            // 
            button1.BackColor = Color.Transparent;
            button1.FlatStyle = FlatStyle.Flat;
            button1.ForeColor = SystemColors.MenuText;
            button1.Image = (Image)resources.GetObject("button1.Image");
            button1.Location = new Point(354, 22);
            button1.Name = "button1";
            button1.Size = new Size(284, 95);
            button1.TabIndex = 0;
            button1.UseVisualStyleBackColor = false;
            button1.Click += button1_Click;
            // 
            // label1
            // 
            label1.AutoSize = true;
            label1.BackColor = Color.Transparent;
            label1.Location = new Point(858, 32);
            label1.Name = "label1";
            label1.Size = new Size(54, 15);
            label1.TabIndex = 1;
            label1.Text = "소지금 2";
            label1.Click += label1_Click;
            // 
            // progressBar1
            // 
            progressBar1.Location = new Point(147, 285);
            progressBar1.Maximum = 1000;
            progressBar1.Name = "progressBar1";
            progressBar1.Size = new Size(700, 3);
            progressBar1.TabIndex = 2;
            progressBar1.UseWaitCursor = true;
            progressBar1.Click += progressBar1_Click;
            // 
            // progressBar2
            // 
            progressBar2.Location = new Point(147, 383);
            progressBar2.Margin = new Padding(0);
            progressBar2.Name = "progressBar2";
            progressBar2.Size = new Size(700, 3);
            progressBar2.TabIndex = 3;
            progressBar2.Click += progressBar2_Click;
            // 
            // CharacterImage1
            // 
            CharacterImage1.AccessibleRole = AccessibleRole.None;
            CharacterImage1.BackColor = Color.Transparent;
            CharacterImage1.Image = Properties.Resources.pngwing_com;
            CharacterImage1.Location = new Point(147, 199);
            CharacterImage1.Name = "CharacterImage1";
            CharacterImage1.Size = new Size(82, 70);
            CharacterImage1.SizeMode = PictureBoxSizeMode.StretchImage;
            CharacterImage1.TabIndex = 4;
            CharacterImage1.TabStop = false;
            CharacterImage1.Click += CharacterImage1_Click;
            // 
            // label2
            // 
            label2.Image = Properties.Resources.pngwing_com;
            label2.Location = new Point(267, 62);
            label2.Name = "label2";
            label2.Size = new Size(200, 200);
            label2.TabIndex = 5;
            label2.Click += label2_Click;
            // 
            // Form2
            // 
            AutoScaleDimensions = new SizeF(7F, 15F);
            AutoScaleMode = AutoScaleMode.Font;
            BackColor = Color.Black;
            BackgroundImage = (Image)resources.GetObject("$this.BackgroundImage");
            BackgroundImageLayout = ImageLayout.None;
            ClientSize = new Size(984, 561);
            Controls.Add(label2);
            Controls.Add(CharacterImage1);
            Controls.Add(progressBar2);
            Controls.Add(progressBar1);
            Controls.Add(label1);
            Controls.Add(button1);
            ForeColor = Color.Transparent;
            Name = "Form2";
            StartPosition = FormStartPosition.CenterScreen;
            Text = "Form2";
            Load += Form2_Load;
            ((System.ComponentModel.ISupportInitialize)CharacterImage1).EndInit();
            ResumeLayout(false);
            PerformLayout();
        }

        #endregion

        private Button button1;
        private Label label1;
        private ProgressBar progressBar1;
        private ProgressBar progressBar2;
        private PictureBox CharacterImage1;
        private Label label2;
    }
}