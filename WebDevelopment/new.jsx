import React from 'react';
import './PersonalPortfolio.css';

const PersonalPortfolio = ({
  name = "John",
  title = "Creative Technologist",
  description = "Amet minim mollit non deserunt ullamco est sit aliqua dolor do amet sint. Velit officia consequat duis enim velit mollit. Exercitation veniam consequat sunt nostrud amet.",
  profileImage = "https://dashboard.codeparrot.ai/api/assets/Z3LtBoDQVAQjI3jc",
  recentPosts = [
    {
      title: "Making a design system from scratch",
      date: "12 Feb 2020",
      tags: ["Design", "Pattern"],
      description: "Amet minim mollit non deserunt ullamco est sit aliqua dolor do amet sint. Velit officia consequat duis enim velit mollit. Exercitation veniam consequat sunt nostrud amet."
    },
    {
      title: "Creating pixel perfect icons in Figma",
      date: "12 Feb 2020", 
      tags: ["Figma", "Icon Design"],
      description: "Amet minim mollit non deserunt ullamco est sit aliqua dolor do amet sint. Velit officia consequat duis enim velit mollit. Exercitation veniam consequat sunt nostrud amet."
    }
  ]
}) => {
  return (
    <div className="portfolio-container">
      <div className="portfolio-content">
        <nav className="navigation">
          <div className="nav-links">
            <a href="#works">Works</a>
            <a href="#blog">Blog</a>
            <a href="#contact">Contact</a>
          </div>
        </nav>

        <div className="main-section">
          <div className="text-content">
            <h1>Hi, I am {name},</h1>
            <h2>{title}</h2>
            <p className="description">{description}</p>
            <button className="download-btn">Download Resume</button>
          </div>
          
          <div className="profile-image">
            <img src={profileImage} alt="Profile" className="profile-pic" />
          </div>
        </div>

        <div className="recent-posts-section">
          <div className="posts-header">
            <h3>Recent posts</h3>
            <a href="#" className="view-all">View all</a>
          </div>
          
          <div className="posts-grid">
            {recentPosts.map((post, index) => (
              <div key={index} className="post-card">
                <h4>{post.title}</h4>
                <div className="post-meta">
                  <span className="date">{post.date}</span>
                  <span className="separator">|</span>
                  <span className="tags">{post.tags.join(', ')}</span>
                </div>
                <p>{post.description}</p>
              </div>
            ))}
          </div>
        </div>

        <div className="featured-works">
          <h3>Featured works</h3>
        </div>

        <div className="decorative-elements">
          <img src="https://dashboard.codeparrot.ai/api/assets/Z3LtB4DQVAQjI3jd" alt="" className="vector-1" />
          <img src="https://dashboard.codeparrot.ai/api/assets/Z3LtB4DQVAQjI3je" alt="" className="vector-2" />
          <img src="https://dashboard.codeparrot.ai/api/assets/Z3LtB4DQVAQjI3jf" alt="" className="mobile-preview" />
        </div>
      </div>
    </div>
  );
};

export default PersonalPortfolio;
